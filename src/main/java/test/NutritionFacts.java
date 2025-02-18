package test;

public class NutritionFacts {
    private final int servingSize; // (mL) majburiy
    private final int servings; // (konteynerda) majburiy
    private final int calories; // (har bir xizmat) ixtiyoriy
    private final int fat; // (g/xizmat) ixtiyoriy
    private final int sodium; // (mg/xizmat) ixtiyoriy
    private final int carbohydrate; // (g/xizmat) ixtiyoriy

    public static class Builder {
        private final int servingSize; // (mL) majburiy
        private final int servings; // (konteynerda) majburiy
        private int calories = 0; // (har bir xizmat) ixtiyoriy
        private int fat = 0; // (g/xizmat) ixtiyoriy
        private int sodium = 0; // (mg/xizmat) ixtiyoriy
        private int carbohydrate = 0; // (g/xizmat) ixtiyoriy

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
