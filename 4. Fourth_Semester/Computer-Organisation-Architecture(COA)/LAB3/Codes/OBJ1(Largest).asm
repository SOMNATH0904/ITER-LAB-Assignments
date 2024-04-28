; SOMNATH SHAW
; 2241019426
; LAB 3 -> OBJECTIVE I (LARGEST)

Data Segment
    Num DB 10 
    arr1 DB 20H,10H,30H,50H,40H
    res DB 10
Data ends

Code Segment
    assume LS:Code,DS:Data
  
Start:
    MOV AX,DATA
    MOV DS,AX
    LEA SI,arr1
    LEA DI,res 
    LEA BX,Num
    MOV CL,[BX]
    DEC CL
    MOV AL,[SI]
    
BACK: 
      INC SI
      CMP AL,[SI]
      JNC FORD 
      MOV AL,[SI]
    
FORD: DEC CL
      JNZ BACK
      MOV [DI],AL
      
Code ends
    end Start