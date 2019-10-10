(ns tutorial.car-type)

(def cars { "bmw" 6000 "ferrari" 1000000 "fiat" 20000 })

(defstruct struct_coupons :name :discount)
(def valid_coupon (struct struct_coupons "20coupon" 0.8))

(defn is_valid_coupon
  [code]
  (if (= (:name valid_coupon) code)
    true
    false)
  )

(defn car_prices
  [budget code]

  (if (is_valid_coupon code)
    (do
      (println "Valid coupon")
      (def discount (:discount valid_coupon))
      (doseq [car cars]
        (def car_type (first car))
        (def price (last car))
        (def price_discount (* price discount))
        (if (<= price_discount budget)
          (println "The " car_type "costs" price_discount)
        )
      )
    )
    (do
      (println "Invalid coupom")
      (doseq [car cars]
        (def car_type (first car))
        (def price (last car))
        (if (<= price budget)
          (println "The" car_type "costs" price))
        )
      )
  )
)


(car_prices 70000 "1")
(car_prices 70000 "20coupon")