package mirea.pr4;

public enum Seasons {
    Winter(-10),
    Spring(13),
    Summer(24),
    Autumn(7);

    private double avgTmp;

    Seasons(double avgTmp){
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp(){
        return avgTmp;
    }
}
