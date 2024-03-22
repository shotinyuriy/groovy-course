package com.test.demo

for (i = 1; i<5; i++) {
	println "i = $i"
}

for (a in 1..5) {
	println "a = $a"
}

for (b in [-1, -2, 1, 0]) {
	println "b = $b"
}

def map = ["language":"Groovy", "subject":"Automation"]
for (e in map) {
	println "e = $e"
}

1.upto(5) { println "it = $it" }

5.times { println "times it = $it" }

1.step(10, 2) { println "step it = $it" }

def y = 10
while (y > 0) {
	println "y = ${y--}"
}