class Point {
	String id
	double x,y;

	//TODO add new variable
  String color;
  
	//TODO constructor
  
  public Point(String id, String color, dobule x, dobule y){
    this.id = id;
    this.color = color;
    this.x = x;
    this.y = y;
  }
  
	//TODO setters and getters
  
  public String  getId(){
    return id;
  }
  public String getColor(){
    return color;
  }
  public Double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public void setId(String id){
      this.id = id;
  }
  public void setColor(String color){
      this.color = color;
  }
  public void setX(Double x){
      this.x = x;
  }
  public void setY(Double y){
      this.y = y;
  }
  
  
	public void move (char xDirection, char yDirection) {
		//TODO
    // levo{-1,0} desno{1,0} gore{0,1} dole{0,-1}
    if(xDirection == -1){
      x -= 1;
    }
    else if(xDirection == 1){
      x += 1;
    } 
    else if(yDirection == 1){
      y += 1;
    }
    else if(yDirection == -1){
      y -= 1;
    }
    
	}
  
	public void draw () {
		//TODO
    System.out.println(x,y);
	}


}


class Canvas{
  List<Point> points;

  public Canvas(List<Point> points){
      this.points = new ArrayList(points);
  }

  public List<Points> add(Point p){
      return this.points.add(p);
  }

  public void remove(Point p){
      this.points.remove(p);
  }

  public void move(char xDirection, char yDirection){
      for(int i=0; i<this.points.length; i++){
      if(xDirection == -1){
        this.points[i].x -= 1;
      }
      else if(xDirection == 1){
        this.points[i].x += 1;
      } 
      else if(yDirection == 1){
        this.points[i].y += 1;
      }
      else if(yDirection == -1){
        this.points[i].y -= 1;
      }
    }
  }


  
}

























