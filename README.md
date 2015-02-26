

SYED MOOSA | 01461 | BSCS 2-A
2/26/2015


SEECS,NUST

JAVA INTERPRETOR MANUAL

.

 

What is This Program All about?

This is a simple Java interpreter which reads commands from a source file, processes it and then performs necessary actions.The commands include :
	Let
	Print
	Expressions and Assignments

Let :
This is the assignment operator,on lhs is the destination operand and on right hand side is source  operand. For instance: 
	Let  x =  5
	Let   x = a
Print :
	This operation just prints statements,it checks wether the operand is defined or not,if it is not, throws an error.
Moreover, anything with in  “ ” is printed as it is!

Expressions and Assignments:
	These are mathematical expressions . Like :
	X = a + b
	Y = a + b / 2 * 3 – 6
If any of the operands on right hand side is not defined, the Interpreter throws an error 

Unit Tests : 

There are 3 unit tests to test the interpreter.
	Add and Subtract :
		This test checks various addition and subtraction cases.
	Multiply and divide :
		This test checks various multiplication and division cases
	Precedence:
		This test checks various  precedence cases.

Link to code on GitHub:

	https://github.com/12bscssjafri/Java-Interpreter/tree/master

