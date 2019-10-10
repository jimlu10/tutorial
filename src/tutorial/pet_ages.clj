(ns tutorial.pet-ages
  (:gen-class))

(def ages { "dog" 7 "cat" 5 "fish" 10 })

(defn human_to_pet
  [pet_name, human_age]
  (* (ages pet_name), human_age))

(println (human_to_pet "dog", 10))