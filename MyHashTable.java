package test;

    public class MyHashTable<K, V> {
        class HashNode<K, V>{
            private K key;
            private V value;
            private  HashNode<K, V> next;

            public HashNode(K key, V value, HashNode<K, V> next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }

            @Override
            public String toString() {
                return "{" + key + " = " + value + "};";
            }
        }
        private HashNode<K, V>[] chainArray = (HashNode<K,V>[]) new HashNode[11];
        private int count = 11;
        private int size = 0;

        private int hash(K key) {
            return key.hashCode() % count;
        }
        public void put(K key, V value){
            int index = hash(key);
            HashNode<K, V> head = chainArray[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value;
                    return;
                }
                head = head.next;
            }
            HashNode<K, V> newNode = new HashNode<K, V>(key, value, chainArray[index]);
            chainArray[index] = newNode;
            size++;
        }

        public V get(K key)
        {
            int index = hash(key);
            HashNode<K, V> head = chainArray[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }

        public V remove(K key){
            int index = hash(key);
            HashNode<K, V> head = chainArray[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    V v = head.value;
                    chainArray[index] = head.next;
                    size--;
                    return v;
                }
                head = head.next;
            }
            return null;
        }

    }

