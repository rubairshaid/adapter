public class jsonclass {

    String str;//str is after change from xml to json
    int i;
    public String convert(String s)
    {
        str="";
        str+="\"";
        i=1;
        while(s.charAt(i)!='>')
        {
            str+=s.charAt(i);
            i++;
        }
        str+="\":";
        if(s.length()==i+1)
        {
            return str;
        }

        else
        {
            i++;
            str+="\"";
           while(s.charAt(i)!='<')
           {
               str+=s.charAt(i);
               i++;
           }
           str+="\",";
           if(s.charAt(++i)=='/')
           {
               str+="\n";
           }
           return str;
        }
    }
}
