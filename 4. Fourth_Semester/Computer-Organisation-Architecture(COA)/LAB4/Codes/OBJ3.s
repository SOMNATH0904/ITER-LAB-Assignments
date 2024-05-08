.global _start
_start:
	ldr r1,=X
	ldr r2,=Y
	
	ldr r3,[r1],#4
	ldr r4,[r1],#4
	and r5,r3,r4	// AND Operation
	str r5,[r2],#4
	orr r6,r3,r4	// OR Operation
	str r6,[r2],#4
	eor r7,r3,r4	// XOR Operation
	str r7,[r2],#4
	mvn r8,r3		// MOVE Negated
	str r8,[r2]
	
here:
	b here
	
.data
X:
	.word 5,7

Y: 
	.word 0,0,0,0