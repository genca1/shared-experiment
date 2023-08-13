#!/usr/bin/env groovy

def call(def branch) {
    if(branch == 'main') {
        echo "it's main branch"
    }
    else {
        echo "noo it's not"
    }
}

