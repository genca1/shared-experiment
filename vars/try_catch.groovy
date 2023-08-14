#!/usr/bin/env groovy

def call() {
      try {
         def arr = new int[3];
         arr[5] = 5;
      } catch(Exception ex) {
         echo ":.. Echo message..: "
         echo ex.getMessage()
         buildResult = currentBuild.result
         currentBuild.result = "UNSTABLE"
      }
}

