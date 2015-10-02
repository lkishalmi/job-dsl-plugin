package javaposse.jobdsl.dsl.helpers.properties

import javaposse.jobdsl.dsl.Context
import javaposse.jobdsl.dsl.Preconditions

class TracContext implements Context {
    String website

    void website(String url){
        this.website = url
    }
}
