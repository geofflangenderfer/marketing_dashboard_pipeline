module User exposing (User, UserId(..))

import Random
import SHA

type UserId 
  = UserId String

generator: Random.Generator UserId
