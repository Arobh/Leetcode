int romanToInt(char * s){
    int i=0;
    int num=0,rem;
    while(s[i]!='\0'){
        switch(s[i]){
            case 'I':
                if(s[i+1]=='V'){
                    i++;
                    num+=4;
                }
                else if(s[i+1]=='X'){
                    i++;
                    num+=9;
                }
                else{
                    num+=1;
                }
                break;
            case 'V':
                num+=5;
                break;
            case 'X':
                if(s[i+1]=='L'){
                    i++;
                    num+=40;
                }
                else if(s[i+1]=='C'){
                    i++;
                    num+=90;
                }
                else{
                    num+=10;
                }
                break;
            case 'L':
                num+=50;
                break;
            case 'C':
                if(s[i+1]=='D'){
                    i++;
                    num+=400;
                }
                else if(s[i+1]=='M'){
                    i++;
                    num+=900;
                }
                else{
                    num+=100;
                }
                break;
            case 'D':
                num+=500;
                break;
            case 'M':
                num+=1000;
                break;
            default :
                break;
        }
        i++;
    }
    return(num);
}