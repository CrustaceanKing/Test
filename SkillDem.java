public class SkillDem
{
    private int i;

    public SkillDem(){
        i = 0;
    }

    public int addI(int num){
        for (int k = 0; k < num; k++){
            this.i = this.i + 1;
        }
        return i;
    }

    public int getI(){
        return this.i;
    } 
}

