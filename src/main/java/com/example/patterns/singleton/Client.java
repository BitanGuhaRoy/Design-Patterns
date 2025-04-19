package com.example.patterns.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
          Singleton singleton  = Singleton.getInstance();

          for(int i =0;i<10;i++){
              singleton = Singleton.getInstance();
          }

//       ExecutorService executorService = Executors.newFixedThreadPool(5);
//       for (int i = 0; i < 10; i++) {
//           executorService.submit(new Threadedsingleton());
//       }
//     executorService.shutdown();




    }
}
