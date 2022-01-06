package com.example;
public sealed interface Result permits Success, Failure {}
final class Success implements Result {}
final class Failure implements Result {}