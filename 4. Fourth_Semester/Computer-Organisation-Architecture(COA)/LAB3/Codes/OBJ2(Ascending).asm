; SOMNATH SHAW
; 2241019426
; LAB 3 -> OBJECTIVE 2 (ASCENDING)


.DATA
COUNT DB 06H
VALUE DB 82H,34H,12H,67H,23H,09H

.CODE
MAIN PROC
    MOV AX, DATA
    MOV DS, AX
    MOV CH, COUNT
    DEC CH
    
    UP2: MOV CL, CH
         LEA SI, VALUE
    
    UP1: MOV AL, [SI]
         CMP AL, [SI+1]
         JC DOWN
         MOV DL, [SI+1]
         XCHG [SI], DL
         MOV [SI+1], DL
         
    DOWN: INC SI
          DEC CL
          JNZ UP1
          DEC CH
          JNZ UP2
          
END MAIN