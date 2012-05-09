(ns functions.string)
(use '[clojure.string :only (join split)])

(defn reverseWords [n]
  (join " " (reverse (split n #"\s"))))