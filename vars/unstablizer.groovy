#!/usr/bin/env groovy

def call() {
  echo "destabilazing the middle east..."
  buildResult = currentBuild.result
  currentBuild.result = "UNSTABLE"
}

