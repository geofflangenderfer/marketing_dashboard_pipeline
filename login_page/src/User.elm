module User exposing (User)

import Random
import SHA

type User 
  = User 
    { userId: UserId
    , integrations: List Integration
    }

generator: Random.Generator User
