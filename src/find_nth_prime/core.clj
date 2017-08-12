(ns find-nth-prime.core
  (:gen-class))

(defn prime? [number]
   (if (<= number 1)
    false
    (if (= number 2)
     true
     (= nil (first
      (for [i (range 2 number)
      :when (zero? (mod number i))] i))))))

(defn get-nth-prime [n]
 (loop [number 2 index 1]
  (if (and (prime? number)(= n index))
    number
    (let [nextNumber (inc number)
          isPrime (prime? number)
          newIndex (if isPrime (inc index) index)]          
         (recur nextNumber newIndex)
        )
    )))

(defn -main
  [& args]
  (println (str "The 10,001st prime is " (get-nth-prime 10001))))
