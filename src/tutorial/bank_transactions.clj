(ns tutorial.bank-transactions)

(def buyer_account (ref 100))
(def merchant_account (ref 0))

(def prices { 'pen 1 'notebook 5 'backpack 10 })
(def items (ref []))

(defn print_info
  []
  (println "\nPrint Info:")
  (println "Buyer Account: " @buyer_account)
  (println "Merchant Account: " @merchant_account)
  (println "Items: " @items))


(defn buy
  [item]
  (def item_price (get prices item))
  (if (<= item_price @buyer_account)
    (dosync
      (ref-set merchant_account (+ @merchant_account item_price))
      (ref-set buyer_account (- @buyer_account item_price))
      (ref-set items (cons item @items))
      )
    (println "Insufficient funds")
  )
  (print_info)
  )

(buy 'pen)
(buy 'notebook)
(buy 'backpack)
(buy 'notebook)
(buy 'notebook)