(ns sorting.bubblesort)

(defn single-sort [xs acc]
  (let [[x1 x2 & xr] xs]
    (if (= nil x2) (conj acc x1)
      (let [[smaller larger] (if (<= x1 x2) [x1 x2] [x2 x1])]
        (recur (cons larger xr) (conj acc smaller))))))

(defn bubble-sort
  ([xs] (bubble-sort xs (count xs)))
  ([xs, counter]
    (if (> counter 0)
      (recur (single-sort xs []) (- counter 1))
      xs)))