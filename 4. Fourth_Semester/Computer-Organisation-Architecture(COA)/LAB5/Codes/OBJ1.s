.global _start
_start:
	
	ldr r0,=count
	ldr r1,=list
	ldr r2,[r0]
	sub r2,r2,#1
	ldr r3,[r1],#4
	
loop:	ldr r4,[r1]
		cmp r3,r4
		blt ford
		ldr r3,[r1]

ford: 	add r1,r1,#4
		adds r2,r2,#-1
		bne loop
		ldr r4,=res
		str r3,[r4]
		
		here: b here
		
.data
	count:	.word 5
	list: 	.word 56,23,76,8,9
	res: 	.word 0