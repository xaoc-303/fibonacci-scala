# fibonacci-scala

[![Build Status](https://travis-ci.org/xaoc-303/fibonacci-scala.svg?branch=master)](https://travis-ci.org/xaoc-303/fibonacci-scala)

Fibonacci: productivity in different languages

## recursive if-else

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 2.13.1 | [Scala](./Fibo.scala) (compiled) | 0,00403636 | 0,03663815 | 0,39777520 | 4,36548853 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## optimization

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 2.13.1 | [Scala](./Fibo.scala) (compiled) | 0,00063741 | 0,00062256 | 0,00062996 | 0,00066500 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

#### setting console command 'time'
```
export TIMEFMT=$'\nreal\t%*E\nuser\t%*U\nsys\t%*S'
```

#### run

```
scalac Fibo.scala
time scala Fibo f1 30
time scala Fibo f2 30
```
