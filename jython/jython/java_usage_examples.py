from java.lang import System as javasystem
javasystem.out.println("Hello")

from java.util import Random

class rand(Random):
    def __init__(self, multiplier=1.0, seed=None):
        self.multiplier = multiplier
        if seed is None:
            Random.__init__(self)
        else: 
            Random.__init__(self, seed)

    def nextDouble(self):
        return Random.nextDouble(self) * self.multiplier

r = rand(100, 23)

for i in range(10):
    print r.nextDouble()