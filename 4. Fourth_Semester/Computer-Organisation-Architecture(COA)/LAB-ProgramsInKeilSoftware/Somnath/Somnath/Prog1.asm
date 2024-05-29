	AREA PRG, CODE, READONLY
	ENTRY

START
	mov r0,#0x04
	mov r1,#0x05
	add r2,r0,r1

my_exit b my_exit                                                                            
END 