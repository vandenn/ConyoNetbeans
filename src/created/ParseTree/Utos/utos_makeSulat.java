abstract class utos_makeSulat implements iNode 
{
    public static class makeSulat extends utos_makeSulat
    {
        public sabi_sabi s; 
        
        public makeSulat(PLACEHOLDER_VARTYPE s)
        {
            this.s = s;
        }
        
        public String toString()
        {
            return "makeSulat(" + s.toString() + ")";
        }
    }
}