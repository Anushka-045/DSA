    var indexSwap = 0;
        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] != 0)
            {
                if (i != indexSwap) ``this warranty that not actions is taken when attempting to swap an index with itself`` 
                {
                    nums[indexSwap] = nums[i]; ``this is not a swap, just an assignation``
                    nums[i] = 0; ``nums[i] should be always be 0. That's why there is not need to actually swap``
                }

                indexSwap++; ``always increment this var``
            }
        }         