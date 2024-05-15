// LAB 5 OBJECTIVE 2

.global _start
_start:
	
	ldr r0,=list
	ldr r1,=oddlist
	ldr r2,=evenlist
	ldr r3,=count
	ldr r3,[r3]
	
loop:	
		ldr r4,[r0],#4
		and r5,r4,#1
		beq odd
		str r4,[r2],#4
		bal ford

odd:	str r4,[r1],#4

ford: 	subs r3,r3,#1
		bne loop
		
		here: b here
		
.data
		count:	.word 5
		list:	.word 0x12,0x13,0x45,0x67,0x23
		oddlist: 	.word 0,0,0,0,0
		evenlist: 	.word 0,0,0,0,0