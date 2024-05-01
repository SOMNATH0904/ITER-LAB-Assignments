.global _start
_start:
	
	ldr r0,=list
	ldr r1,[r0],#4
	ldr r2,[r0],#4
	
	add r3,r1,r2
	subs r4,r1,r2
	
	ldr r5,[r0]
	mul r6,r5,r5
	
	mov r7,#1
	swi 0
	
.data
list:
	.word 2,3,4