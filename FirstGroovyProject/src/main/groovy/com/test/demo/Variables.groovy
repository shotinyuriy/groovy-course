package com.test.demo

def name = 'Raghav'
println 'Name is '+name

String name2 = 'Yuriy'
println 'Name is ${name2}'
name2 = 10.10
println "name2 = $name2"

name3 = 'Lyubov'
println "Name is ${name3}"
name3 = 10
println "Name is $name3"

def (String a, int b, double c) = [10, 20, 30]
println "a = $a"
println "b = $b"
println "c = $c"


