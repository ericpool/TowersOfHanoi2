package com.example.towersofhanoi;

public class Tower
{
    private Disk top;
    private int count;

    public Tower()
    {
        this.top = null;
        this.count = 0;
    }

    public Disk peek()
    {
        return this.top;
    }

    public Disk pop()
    {
        Disk diskToReturn = this.top;

        if(this.top != null)
        {
            this.top = this.top.getNextDisk();
            diskToReturn.setNextDisk(null);
        }
        count--;
        return diskToReturn;
    }

    public boolean push(Disk d)
    {
        if(this.top == null)
        {
            this.top = d;

        }
        else if(d.getSize() < this.top.getSize())
        {
            d.setNextDisk(this.top);
            this.top = d;

        }
        else
        {
            //illegal move
            return false;
        }
        this.count++;
        return true;
    }

    public void display()
    {
        Disk currDisk = this.top;
        while(currDisk != null)
        {
            currDisk.display();
            currDisk = currDisk.getNextDisk();
        }
    }


    public int getCount() {
        return count;
    }
}
