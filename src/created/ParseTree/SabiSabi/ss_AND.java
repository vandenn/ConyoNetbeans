abstract class ss_AND implements iNode
{
    public static class ssANDExpansion extends ss_AND
    {
        public ss_AND a;
        public ss_equality e;
        
        public ssORExpansion(ss_equality e, ss_AND a)
        {
            this.a = a;
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString() + " AND " + a.toString();
        }
    }
    
    public static class ssAND extends ss_AND
    {
        public ss_equality e;
        
        public ssOR(ss_equality e)
        {
            this.e = e;
        }
        
        public String toString()
        {
            return e.toString();
        }
    }
    
}


//ss_AND ::= ss_equality:e AND AND ss_AND:a {: RESULT = new ssANDExpansion(e, a); :}
//		| ss_equality:e {: RESULT = new ssAND(e); :};