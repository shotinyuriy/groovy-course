package com.test.demo

def num = 0

if(num == 10) {
	println 'num is 10'
} else {
	println 'num is not 10'
}


if (num > 0) {
	println 'Number is positive'
} else if(num < 0) {
	println 'Number is negative' 
} else {
	println 'Number is zero'
}

def x = -0.01
switch (x) {
	case 0:
		println "x is zero"
		break
	case {x > 0}:
		println "x is positive"
		break
	case {x < -0.1}:
		println "x is negative"
		break
	default:
		println "x is invalid"
}