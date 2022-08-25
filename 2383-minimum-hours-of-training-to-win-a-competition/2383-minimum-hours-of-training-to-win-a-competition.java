class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        // int n = energy.length;
        // int train_hr = 0;
        // int sum_energy = 0;
        // int sum_experience = 0;
        // for(int i=0; i<n; i++){
        //     sum_energy += energy[i];
        // }
        // for(int i=0; i<n; i++){
        //     sum_experience += experience[i];
        // }
        // if((initialEnergy>sum_energy)&&(initialExperience>sum_experience)){
        //     return 0;
        // }
        // else if(initialEnergy>sum_energy){
        //     int temp = initialExperience;
        //     for(int i=0; i<n; i++){
        //         if(temp>experience[i]){
        //             temp += experience[i];
        //         }
        //         else{
        //             train_hr += ((experience[i]-temp)+1);
        //             temp += (experience[i]+train_hr);
        //         }
        //     }
        // }
        // else if(initialExperience>sum_experience){
        //     train_hr += ((sum_energy-initialEnergy)+1);
        // }
        // else{
        //     int temp1 = initialExperience;
        //     for(int i=0; i<n; i++){
        //         if(temp1>experience[i]){
        //             temp1 += experience[i];
        //         }
        //         else{
        //             train_hr += ((experience[i]-temp1)+1);
        //             temp1 += (experience[i]+train_hr);
        //         }
        //     }
        //    train_hr += ((sum_energy-initialEnergy)+1); 
        // }
        // return train_hr;
        int currentEnergy = initialEnergy;
        int currentExperience = initialExperience;
        int result = 0;
        int diff = 0;
        for (int i = 0; i < energy.length; i++) {
            if (energy[i] >= currentEnergy) {   
                diff = energy[i] - currentEnergy + 1;
                result = result + diff;
                currentEnergy = currentEnergy + diff;
            }
            currentEnergy = currentEnergy - energy[i];
            if (experience[i] >= currentExperience) {
                diff = experience[i] - currentExperience + 1;
                result = result + diff;
                currentExperience = currentExperience + diff;
            }
            currentExperience = currentExperience + experience[i];
        }
        return result;
    }
}