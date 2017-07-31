PImage ground;
PImage water;
PImage plyr;
ArrayList<PImage> bla = new ArrayList();
PVector plyrPos= new PVector(20, 200);
int gravity;

int levelSize=37;
int[] blockHeight = new int[levelSize+1];
ArrayList<RectShape> rects = new ArrayList<RectShape>();


void setup()
{
  size (800, 400);
  
  RectShape player = new RectShape(plyrPos.x, plyrPos.y, 10,10);
  rects.add(player); 
  
  ground= loadImage("ground.png");
  water= loadImage("water.png");
  plyr= loadImage("plyr.png");
  
  bla.add(ground);
  bla.add(ground);
  
  gravity=1;

  for(int i=0; i<levelSize; i++)
  {
    int num1 = getRandom(); 
    int num2 = (int)random(-30, 30);
    int num3= num1*num2;
    blockHeight[i]=-100+(num3);
    {
       int num = getRandom(); 
       if(num==1)
       {
         bla.add(ground);
       }
       if(num==2)
       {
         bla.add(water);
         if(bla.get(bla.size()-2) == water && bla.get(bla.size()-3) == water)
         {
           bla.remove(i);
           i--;
         }
       }
    }
  }
  for(int i=0; i<levelSize; i++)
  {
    RectShape ground = new RectShape(i*20, 390, 20, blockHeight[i]);
    rects.add(ground);
  }
} 

void draw()
{
  background(100,100,170);
  rects.get(0).position.y=plyrPos.y;
  plyrPos.y+=gravity;

  image(plyr,plyrPos.x, plyrPos.y, 10,10);
  //println(plyrPos.y);
  
  for(int i =1; i<rects.size()-1; i++)
  {
    rects.get(i+1).h=blockHeight[i];
    
  }
  
  
  for(int i =0; i<bla.size()-1; i++)
  {
    image(bla.get(i), i*20,390, 20, blockHeight[i]); 
    rect(i*20, 390, 1, 1);
    
    text(" "+(i+1), i*20, 200); 
    if(mouseX>= i*20 && mouseX<= (i*20)+20 && mousePressed)
    {
      if(bla.get(i)!=water)
      {
        if(blockHeight[i]!=-10)
        {
         blockHeight[i]+=1;
        }
      }
    }
    if(bla.get(i)==water)
    {
      if(i!=37)
      {
        if(blockHeight[i+1]>blockHeight[i-1])
        {
          if(bla.get(i+1)!=water)
          {
            blockHeight[i]=blockHeight[i+1]+10;
          }
          else{
            blockHeight[i]=blockHeight[i+1];
          }
        }
        else
        {
          if(bla.get(i-1)!=water)
          {
            blockHeight[i]=blockHeight[i-1]+10;
          }
          else{
            blockHeight[i]=blockHeight[i-1];
          }
        }
      }
    }
  }
   
    RectShape rect1 = rects.get(0);
    //rect1.display();
    for (int j = 1 ; j < rects.size() ; j ++)
    {
      RectShape rect2 = rects.get(j);
      //rect2.display();
      if (rect1.collides(rect2))
      {
        text("Rectangle " + 0 + " collides with " + " rect " + j, 100, 100);
        gravity=0;
      }  
    }
}

int getRandom()
{
  int num=(int)random(1,3);
  return num; 
}

