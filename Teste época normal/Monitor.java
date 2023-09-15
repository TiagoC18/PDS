public abstract class Monitor {
        protected StudentAdm adm;
        
        public Monitor(StudentAdm adm) {
            this.adm = adm;
            adm.addMonitor(this);
        }
    
        public abstract void output(String className, double score, Student student);
    }
    