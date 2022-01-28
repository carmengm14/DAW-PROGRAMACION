class Heater {
   private double temperature;
   private double min;
   private double max;
   private double increment;

   public Heater(double minimo, double maximo){
    temperature = 15.0;

    min = minimo;
    max = maximo;
    increment = 5.0;

   }
   //setters (warmer y coolers son mutadores con lo cual son setters tmb)
  public void warmer(double temperatura){
      if (temperatura + increment <= max) {
          temperature = temperatura + increment;
        }
    }
  public void cooler(double temperatura){
      if (temperatura - increment >= min) {
          temperature = temperatura - increment;
        }
    }
   
  public void setIncrement(double incremento){
    if (increment >= 1.0 && increment <= 5.0) {
        increment = incremento;
    }
  }
  //getter
  public double getTemperature(){
      return temperature;
  }
 

}
