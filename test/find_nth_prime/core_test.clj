(ns find-nth-prime.core-test
  (:require [clojure.test :refer :all]
            [find-nth-prime.core :refer :all]))

(deftest get-nth-prime-6thIs13
 (testing "The 6th prime is 13"
   (is (= (get-nth-prime 6) 13))))

(deftest get-nth-prime-1stIs2
 (testing "The 6th prime is 13"
   (is (= (get-nth-prime 1) 2))))

;(run-tests 'find-nth-prime.core-test)
