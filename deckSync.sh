#!/bin/bash

pushd kong || exit
deck sync
popd || exit
