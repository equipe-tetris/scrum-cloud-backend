package com.scrumcloud.scrumcloud.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@CrossOrigin
@RestController
@RequestMapping("/votacao")
public class VotacaoResource {

    @GetMapping("/status-task/{idTask}")
    DeferredResult<String> test(@PathVariable Long idTask){
        Long timeOutInMilliSec = 100000L;
        String timeOutResp = "Time Out.";
        DeferredResult<String> deferredResult = new DeferredResult<>(timeOutInMilliSec,timeOutResp);
        CompletableFuture.runAsync(()->{
            try {
                String teste = "false" + idTask.toString();
                TimeUnit.SECONDS.sleep(10);
                //set result after completing task to return response to client
                try{
                    Thread.sleep(3000);
                    teste = "true" + idTask.toString();

                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                deferredResult.setResult(teste);
            }catch (Exception ex){
            }
        });
        return deferredResult;
    }
}
