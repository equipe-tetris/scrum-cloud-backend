package com.scrumcloud.scrumcloud.service;

import com.scrumcloud.scrumcloud.dto.ResultadoVotosDTO;
import com.scrumcloud.scrumcloud.dto.TaskDTO;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RelatorioService {

    @Autowired
    VotacaoService votacaoService;

    @Autowired
    TaskService taskService;

    @SneakyThrows
    public File gerarArquivoXlsx(Long idSala) throws IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Relatório de Votacao");
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);
        sheet.setColumnWidth(2, 4000);
        sheet.setColumnWidth(3, 4000);

        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Task");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Media");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(2);
        headerCell.setCellValue("Moda");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(3);
        headerCell.setCellValue("Valor Final");
        headerCell.setCellStyle(headerStyle);


        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        List<TaskDTO> listTask = taskService.buscarTasksPorIdSala(idSala);

        int rownum = 0;
        for(TaskDTO task : listTask) {
            ResultadoVotosDTO result = votacaoService.buscarInfoVotosPorIdTask(task.getId());
            String valorFinal = taskService.getValorFinalTaskPorId(task.getId());

            Row row = sheet.createRow(++rownum);

            Cell cell = row.createCell(0);
            cell.setCellValue(task.getConteudo());
            cell.setCellStyle(style);

            cell = row.createCell(1);
            cell.setCellValue(result.getMediaVotosNumericos());
            cell.setCellStyle(style);

            cell = row.createCell(2);
            cell.setCellValue(result.getModa());
            cell.setCellStyle(style);

            cell = row.createCell(3);
            cell.setCellValue(valorFinal);
            cell.setCellStyle(style);

        }

        File arquivo = new File("relatorio-sala-planning_"+ LocalDateTime.now().getNano()+".xlsx");
        FileOutputStream out = new FileOutputStream(arquivo);
        workbook.write(out);
        workbook.close();
        out.close();

        return arquivo;
    }


}
