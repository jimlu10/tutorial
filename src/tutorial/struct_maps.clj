(ns tutorial.struct-maps)

(defn pets
  []
  (defstruct pet :pet_type :pet_name)
  (def my_pet (struct pet "dog" "fido"))
  (println my_pet)

  (def my_other_pet (struct-map pet :pet_name "Fifi" :pet_type "cat"))
  (println my_other_pet)
  (println (:pet_name my_pet))
  (println (:pet_type my_other_pet))

  (def my_new_pet (assoc my_pet :pet_name "Max"))
  (println my_new_pet)

  (def my_new_other_pet (assoc my_other_pet :pet_age 10))
  (println my_new_other_pet)
  )

(pets)