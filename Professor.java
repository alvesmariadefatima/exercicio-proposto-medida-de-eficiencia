package mariadefatima;

    public class Professor extends Pessoa {
        private String matricula;
        private String curso;

        public Professor(String nome, String cpf, String matricula, String curso){
                super(nome,cpf);
                this.matricula = matricula;
                this.curso = curso;
        }
        public String getMatricula(){
            return this.matricula;
        }
        public void setMatricula(String matricula){
            this.matricula=matricula;
        }
        public String getCurso(){
            return this.curso;
        }
        public void setCurso(){
            this.curso = curso;
        }
    }