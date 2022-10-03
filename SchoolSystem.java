public class SchoolSystem implements IParams,ISignUp{
    private Integer big;
    private Integer medium;
    private Integer small;


    public SchoolSystem(Integer big, Integer medium, Integer small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    @Override
    public int getBig() {
        return big;
    }

    @Override
    public int getMedium() {
        return medium;
    }

    @Override
    public int getSmall() {
        return small;
    }


    @Override
    public boolean addStudent(int stuType) {
        boolean jieguo;
        switch (stuType){
            case 1:
                if (big>0){
                    big--;
                    jieguo=true;
                }else {
                    jieguo=false;
                }
                break;
            case 2:
                if (medium>0){
                    medium--;
                    jieguo=true;
                }else {
                    jieguo=false;
                }
                break;
            case 3:
                if (small>0){
                    small--;
                    jieguo=true;
                }else {
                    jieguo=false;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + stuType);
        }
        return jieguo;
    }
}
