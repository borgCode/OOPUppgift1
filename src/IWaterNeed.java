public interface IWaterNeed {
     String calculateWaterNeed();
     String getWaterType();
     
     //Method för att formatera mängder under 1 liter som centiliter
     default String formatWaterNeed(double waterAmount) {
          if (waterAmount < 1.0) {
               double centiliters = waterAmount * 100;
               //Om det är ett hel tal vill vi inte ha decimaler
               return (centiliters % 1 == 0) ? String.format("%.0f cl", centiliters) : String.format("%.1f cl", centiliters);
          } else {
               return (waterAmount % 1 == 0) ? String.format("%.0f L", waterAmount) : String.format("%.1f L", waterAmount);
          }
     }
}
