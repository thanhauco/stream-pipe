package com.example;
public interface Processor {
    void process(String msg) throws PipelineException;
}