public class MargueritaCertifier extends PizzaCertifier{

    @Override
    boolean isCertified(Pizza pizza){
        int certified = 0;

        /*for(int i = 0; i < pizza.getIngredients().size(); i++) {
            System.out.print(pizza.getIngredients().get(i).getName() + "-");
        }*/


        for(int i = 0; i < pizza.getIngredients().size(); i++){
            if (!pizza.getIngredients().get(i).getName().equals("Tomato") &&
                    !pizza.getIngredients().get(i).getName().equals("Mozzarella") &&
                    !pizza.getIngredients().get(i).getName().equals("Basil")) {
                return false;
            }
            else certified += 1;
        }
        //System.out.println("certifiedIngredients: " + certified + "\n");
        return certified == 3;
    }

}
