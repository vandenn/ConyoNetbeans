abstract class utos_makeSabi implements iNode 
{
    public static class makeSabi extends utos_makeSabi
    {
        public sabi_sabi s; 
        
        public makeSabi(sabi_sabi s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSabi " + s.toString();
        }
    }
}