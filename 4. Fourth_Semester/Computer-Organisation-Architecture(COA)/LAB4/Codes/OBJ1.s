.global _start
_start:
	
	mov r0,#0x03
	mov r1, #0x05
	add r2,r0,#0x08
	subs r3,r1,#0x04
	
s: 
		b s
		.end