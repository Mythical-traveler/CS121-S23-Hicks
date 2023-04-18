public class Pokemon {
    public String name, move;
    public int hitPoints, movePower, attackSpeed;


    public void setAttackSpeed() {
        this.attackSpeed = attackSpeed;
    }

    public void setHitPoints() {
        this.hitPoints = hitPoints;
    }

    public void setMove() {
        this.move = move;
    }

    public void setName() {
        this.name = name;
    }

    public void setMovePower()
    {
        this.movePower = movePower;
    }

    public int getAttackSpeed(int attackSpeed) {
        return attackSpeed;
    }

    public int getMovePower(int movePower) {
        return movePower;
    }

    public int getHitPoints(int hitPoints)
    {
        return hitPoints;
    }

    public String getMove(String move) {
        return move;
    }

    public String getName(String name)
    {
        return name;
    }


    public void Poke(String name, String move, int hp, int mp, int as)
    {
       this.name=name;
       this.move=move;
       this.hitPoints=hp;
       this.movePower=mp;
       this.attackSpeed=as;


    }
    public void displayPokemonStats()
    {
        System.out.println("Name: "+name);
        System.out.println("Move: "+move);
        System.out.println("Move Power: "+movePower);
        System.out.println("Attack Speed: "+attackSpeed);
        System.out.println("Hit Points: "+hitPoints);
    }
}






